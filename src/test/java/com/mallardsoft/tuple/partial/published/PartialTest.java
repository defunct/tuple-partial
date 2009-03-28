package com.mallardsoft.tuple.partial.published;

import static org.testng.Assert.assertEquals;

import java.io.File;

import org.testng.annotations.Test;

import com.mallardsoft.tuple.Pair;
import com.mallardsoft.tuple.Triple;
import com.mallardsoft.tuple.Tuple;
import com.mallardsoft.tuple.partial.Compare;
import com.mallardsoft.tuple.partial.Partial;

public class PartialTest
{
    @Test
    public void bucketed()
    {   
        Partial<
        Pair<String, Integer>
        ,
        Triple<String, Integer, File>
        > twoOfTriple
            = Compare.twoOf(Compare.<String, Integer, File>triple());
        
        Comparable<Triple<String, Integer, File>> compare = twoOfTriple.compare(Tuple.from("A", 1));
        assertEquals((int) compare.compareTo(Tuple.from("A", 1, new File("A"))), 0);
    }
    
    @Test
    public void reversed()
    {
        int compare = Compare
                        .<Character>ignore()
                        .<Integer>shared()
                        .<String>shared()
                            .comparable(Tuple.from("A", 1))
                            .compareTo(Tuple.from("A", 1 , 'A'));
        assertEquals(compare, 0);
    }
}
