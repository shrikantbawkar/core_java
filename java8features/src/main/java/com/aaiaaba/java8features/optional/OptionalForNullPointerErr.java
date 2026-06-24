package com.aaiaaba.java8features.optional;

import java.util.Optional;

public class OptionalForNullPointerErr {
    public static void main(String[] args) {
        Optional<String> emptyStr = Optional.empty();

        Optional<String> notEmp = Optional.of("No Empty but usefull");
        if (emptyStr.isEmpty()) {
            System.out.println("This is Empty");
        }

        if (notEmp.isPresent()) {
            System.out.println(notEmp.get());
        }

        notEmp.ifPresent(System.out::println);

    }
}
