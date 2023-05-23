package ch.zhaw.iwi.devops.demo;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

import ch.zhaw.iwi.devops.demo.PathListEntry.Key;

public class PathListEntryTest {
    
    @Test
    public void test1(){
        PathListEntry listEntry = new PathListEntry<>();
        listEntry.setActive(true);
        listEntry.setColor("green");
        listEntry.setName("Test1");
        assertEquals(true, listEntry.isActive());
        assertEquals("green", listEntry.getColor());
        assertEquals("Test1", listEntry.getName());
    }
}
