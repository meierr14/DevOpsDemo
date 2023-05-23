package ch.zhaw.iwi.devops.demo;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.description;

import org.junit.jupiter.api.Test;

public class ToDoTest {

    @Test
    public void testToDo() {
        var toDo1 = new ToDo(1, "title", "description");
        assertEquals("title", toDo1.getTitle());
        assertEquals("description", toDo1.getDescription());
        assertEquals(1, toDo1.getId());
    }

    @Test
    public void testToDo2() {
        var todo2 = new ToDo(2, "test", "test nr 2");
        assertEquals("test", todo2.getTitle());
        assertEquals("test nr 2", todo2.getDescription());
        assertEquals(2, todo2.getId());
    }

    @Test
    public void testToDo3(){
        var todo3 = new ToDo(2, "test3", "ID should be 3");
        todo3.setId(3);
        assertEquals(3, todo3.getId());
    }
    
}
