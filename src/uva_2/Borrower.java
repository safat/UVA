/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package uva_2;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Map;
import java.util.PriorityQueue;
import java.util.Scanner;
import java.util.TreeSet;

/**
 *
 * @author user
 */
public class Borrower {
//uva 230

    /**
     * @param args the command line arguments
     */
    static class Book implements Comparator<Book> {

        private String title, author;

        public Book(String author, String title) {
            this.title = title;
            this.author = author;
        }
        public static Comparator<Book> bookComparator = new Comparator<Book>() {
            @Override
            public int compare(Book t, Book t1) {
                if (t.author.compareTo(t1.author) == 0) {
                    return t.title.compareTo(t1.title);
                } else {
                    return t.author.compareTo(t1.author);
                }
            }
        };

        @Override
        public String toString() {
            return "Book{" + "author=" + author + ", title=" + title + '}';
        }

        @Override
        public int compare(Book t, Book t1) {
            if (t.author.compareTo(t1.author) == 0) {
                return t.title.compareTo(t1.title);
            } else {
                return t.author.compareTo(t1.author);
            }
        }
    }

    public static void main(String[] args) {
        // TODO code application logic here
        Scanner input = new Scanner(System.in);
        Map<String, String> bookMap = new HashMap();
        ArrayList<Book> bookList = new ArrayList();
        TreeSet<String> availableBooks = new TreeSet();
        PriorityQueue<Book> returnQueue = new PriorityQueue(10, Book.bookComparator);
        while (true) {
            String line = input.nextLine();
            if (line.equals("END")) {
                break;
            }
            String bookInfo[] = line.split("by");
            bookMap.put(bookInfo[0], bookInfo[1]);
            bookList.add(new Book(bookInfo[1], bookInfo[0]));
            availableBooks.add(bookInfo[0]);
        }
        while (true) {
            String line = input.nextLine();
            if (line.equals("END")) {
                break;
            } else if (line.equals("SHELVE")) {
                int i = 0;
                while (!returnQueue.isEmpty()) {
                    Book cBook = returnQueue.poll();
                    int size = bookList.size();
                   System.out.println("Put "+cBook.title);
                }
                System.out.println("END");
            } else {
                String[] commands = line.split(" ");
                if (commands[0].equals("BORROW")) {
                    int size = bookList.size();
                    for (int i = 0; i < size; i++) {
                        Book bk = bookList.get(i);
                        if (bk.title.equals(commands[1])) {
                            bookList.remove(bk);
                            break;
                        }
                    }
                } else {
                    returnQueue.add(new Book(bookMap.get(commands[1]), commands[1]));
                }
            }
        }
    }
}
