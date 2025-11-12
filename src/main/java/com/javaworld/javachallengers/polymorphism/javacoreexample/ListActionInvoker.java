package com.javaworld.javachallengers.polymorphism.javacoreexample;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Vector;
import java.util.concurrent.CopyOnWriteArrayList;

public class ListActionInvoker {

    public static void main(String... masterPolymorphism) {
        ListAction listAction = new ListAction();
        listAction.executeListActions(new Vector<>());
        listAction.executeListActions(new ArrayList<>());
        listAction.executeListActions(new LinkedList<>());
        listAction.executeListActions(new CopyOnWriteArrayList<>());

        // Without polymorphism
        listAction.executeVectorActions(new Vector<>());
        listAction.executeArrayListActions(new ArrayList<>());
        listAction.executeLinkedListActions(new LinkedList<>());
        listAction.executeCopyOnWriteArrayListActions(new CopyOnWriteArrayList<>());
    }

}
