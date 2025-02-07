package com.example.addTask;

import org.junit.Test;
import static org.junit.Assert.assertArrayEquals;

public class AddTaskMainTest {

    @Test
    public void testFindPath() {
        char[][] inputMap = {
                {'#', 's', '#', '#', '#'},
                {'#', '.', '.', '.', '#'},
                {'.', '.', '#', '.', '#'},
                {'.', '#', '.', '.', '#'},
                {'#', '#', '#', '.', 'f'}
        };

        char[][] expectedMap = {
                {'#', 's', '#', '#', '#'},
                {'#', '*', '*', '*', '#'},
                {'.', '.', '#', '*', '#'},
                {'.', '#', '.', '*', '#'},
                {'#', '#', '#', '*', 'f'}
        };

        char[][] resultMap = AddTaskMain.findPath(inputMap);

        assertArrayEquals(expectedMap, resultMap);
    }
}