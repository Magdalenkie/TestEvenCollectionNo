package com.kodilla.testing.collection;
import com.kodilla.testing.collection.CollectionTestSuite;
import org.junit.*;

import java.util.ArrayList;
import java.util.Arrays;

public class CollectionTestSuite {

    @Before
    public void before(){
        System.out.println("Test Case: begin");
    }
    @After
    public void after(){
        System.out.println("Test Case: end");
    }

    @Test
    public void testOddNumbersExterminatorEmptyList(){
        //Given
        ArrayList<Integer> test1 = new ArrayList<>();

        //When
        System.out.println("Testing " + test1.toString());

        //Then
        Assert.assertEquals(OddNumbersExterminator.exterminate(test1), new ArrayList<Integer>());

    }

    @Test
    public void testOddNumbersExterminatorNormalList(){
        //Given
        ArrayList<Integer> test1 = new ArrayList<>(Arrays.asList(2,3,4,6,9,44,7));
        ArrayList<Integer> expectedEven = new ArrayList<>(Arrays.asList(2,4,6,44));

        //When
        System.out.println("Testing " + test1.toString());

        //Then
        Assert.assertEquals(OddNumbersExterminator.exterminate(test1), expectedEven);
    }
}
