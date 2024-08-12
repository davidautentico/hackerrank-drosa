package com.drosa.hackerrank.priortyqueue;

import java.util.*;
import java.util.stream.Collectors;

class StudentComparator implements Comparator<Student> {

    @Override
    public int compare(Student s1, Student s2) {

        if (s1.getCGPA() != s2.getCGPA()) return Double.compare(s2.getCGPA(), s1.getCGPA());

        if (!s1.getName().equals(s2.getName())) return s1.getName().compareTo(s2.getName());

        return Integer.compare(s1.getID(), s2.getID());
    }
}

class Priorities {

    public List<Student> getStudents(List<String> events) {

        List<Student> pendingList = new ArrayList<>();
        PriorityQueue<Student> priorityQueue = new PriorityQueue<>(new StudentComparator());

        for (String event : events) {
            String[] eventItems = event.split(" ");
            String eventType = eventItems[0];

            if (eventType.equals("SERVED")) {
                Student student = priorityQueue.poll();
                System.out.println("removed <- " + student);
            } else {
                String name = eventItems[1];
                double cgpa = Double.parseDouble(eventItems[2]);
                int id = Integer.parseInt(eventItems[3]);

                Student student = new Student(id, name, cgpa);
                priorityQueue.add(student);

                System.out.println("added -> " + student);
            }
        }

        while (!priorityQueue.isEmpty()) {
            pendingList.add(priorityQueue.poll());
        }
        return pendingList;
    }
}

class Student {

    private int ID;
    private String name;
    private double CGPA;

    public Student(int ID, String name, double CGPA) {
        this.ID = ID;
        this.name = name;
        this.CGPA = CGPA;
    }

    String getName() {
        return name;
    }

    public int getID() {
        return ID;
    }

    public double getCGPA() {
        return CGPA;
    }

    @Override
    public String toString() {
        return "Student{" +
                "ID=" + ID +
                ", name='" + name + '\'' +
                ", CGPA=" + CGPA +
                '}';
    }
}

public class Main {
    private final static Scanner scan = new Scanner(System.in);
    private final static Priorities priorities = new Priorities();

    public static void main(String[] args) {
        //int totalEvents = Integer.parseInt(scan.nextLine());
        List<String> events = new ArrayList<>();

       /* while (totalEvents-- != 0) {
            String event = scan.nextLine();
            events.add(event);
        }*/

        events.add("ENTER John 3.75 50");
        events.add("ENTER Mark 3.8 24");
        events.add("ENTER Shafaet 3.7 35");
        events.add("SERVED");
        events.add("SERVED");
        events.add("ENTER Samiha 3.85 36");
        events.add("SERVED");
        events.add("ENTER Ashley 3.9 42");
        events.add("ENTER Maria 3.6 46");
        events.add("ENTER Anik 3.95 49");
        events.add("ENTER Dan 3.95 50");
        events.add("SERVED");

        List<Student> students = priorities.getStudents(events);

        if (students.isEmpty()) {
            System.out.println("EMPTY");
        } else {
            for (Student st : students) {
                System.out.println(st.getName());
            }
        }
    }
}
