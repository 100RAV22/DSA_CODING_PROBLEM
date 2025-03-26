import java.util.*;
class student{
    static class Student implements Comparable<Student>{
        int rank;
        String name;
        public Student(int r, String n){
            this.rank = r;
            this.name = n;
        }
        public int compareTo(Student s1){
            return this.rank-s1.rank;
        }
    }
    public static void main(String args[]){
        PriorityQueue<Student> pq = new PriorityQueue<>();
        pq.add(new Student(1, "John"));
        pq.add(new Student(4, "ronny"));
        pq.add(new Student(3, "sunny"));
        pq.add(new Student(5, "doe"));
        pq.add(new Student(2, "stark"));
        
        while(!pq.isEmpty()){
            System.out.println("Name : "+ pq.peek().name+ " , Rank : "+pq.peek().rank);
            pq.remove();
        }
    }
}