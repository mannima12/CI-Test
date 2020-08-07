/**
 * Copyright 2020 Dynatrace LLC
 *
 * <p>Licensed under the Apache License, Version 2.0 (the "License"); you may not use this file
 * except in compliance with the License. You may obtain a copy of the License at
 *
 * <p>http://www.apache.org/licenses/LICENSE-2.0
 *
 * <p>Unless required by applicable law or agreed to in writing, software distributed under thegit push
 */
package CI.Test;

public class Library {
    public int sum(int a, int b) {
        return a + b;
    }

    public int divide(int a, int b) {
        return a / b;
    }

    public int multiply(int a, int b) {
        return a * b;
    }

    public int minus(int a, int b) {
        return a - b; // ERROR!!!
    }
}
