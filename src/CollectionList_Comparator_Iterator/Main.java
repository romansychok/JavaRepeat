package CollectionList_Comparator_Iterator;

import java.util.*;

public class Main {
    public static void main(String[] args) {
//
//        List<String> list = new ArrayList<>();
//        list.add("one");
//        list.add("two");
//        list.add("three");
//        list.add("one");
//        System.out.println(list);
////        for (String s : list) {
////            System.out.println(s);
////        }
//        System.out.println(list.size());
//        System.out.println(list.contains("two"));
//        System.out.println(list.get(1));
//        System.out.println(list.lastIndexOf("one"));
//        System.out.println(list.set(0,"six"));
//        System.out.println(list);
//        list.clear();
//        System.out.println(list);

//        List<String> s = new ArrayList<>();
//        s.add("two");
//        s.add("three");
//        s.add("six");
//        s.add("seven");

//        System.out.println(list.removeAll(s));
//        System.out.println(list);

//        System.out.println(list.retainAll(s));
//        System.out.println(list);
//        System.out.println(list.isEmpty());


//        ArrayList<String> arrayList = new ArrayList<>(list);
//        arrayList.addAll(list);
//        System.out.println(arrayList);

//        arrayList.trimToSize();
//        arrayList.ensureCapacity(40);

//        LinkedList<String> linkedList = new LinkedList<>(list);
//        linkedList.push("five");
//        System.out.println(linkedList);
//        linkedList.addFirst("six");
//        System.out.println(linkedList);
//        linkedList.pop();
//        System.out.println(linkedList);
//        linkedList.offer("nine");
//        System.out.println(linkedList);
//        System.out.println(linkedList.poll());


//        ArrayList<Person> people = new ArrayList<>();
//        people.add(new Person("Vova",22));
//        people.add(new Person("Lena",19));
//        people.add(new Person("anna",2));
//        people.add(new Person("oleg",25));

//        Iterator<Person> personIterator = people.iterator();
//        while (personIterator.hasNext()) {
//            Person person = personIterator.next();
//            System.out.println(person);
//        }


//        while (personIterator.hasNext()) {
//            Person person = personIterator.next();
//            if (person.getName().equals("oleg")){
//                personIterator.remove();
//            }
//        }
//        System.out.println(people);

//        ListIterator<Person> listIterator = people.listIterator();
//        while (listIterator.hasNext()) {
//            Person person = listIterator.next();
//        }
//        System.out.println();
//        listIterator.set(new Person("Olya",19));
//        while (listIterator.hasPrevious()) {
//            Person person = listIterator.previous();
//            System.out.println(person);
//        }


//        ArrayList<String> strings = new ArrayList<>();
//        strings.add("b");
//        strings.add("h");
//        strings.add("w");
//        strings.add("a");
//
//        Collections.sort(strings);
//        System.out.println(strings);

        ArrayList<Person> people = new ArrayList<>();
        people.add(new Person("Vova",22));
        people.add(new Person("Lena",19));
        people.add(new Person("Anna",2));
        people.add(new Person("oleg",25));

//        Collections.sort(people, new SortByName());
//        System.out.println(people);
//
//        Collections.sort(people, new SortByAge());
//        System.out.println(people);

        Collections.sort(people, new SortByChoise().sortBychoise(1));
        System.out.println(people);



    }
}
