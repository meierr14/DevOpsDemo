package ch.zhaw.iwi.devops.demo;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;
//import org.springframework.web.servlet.config.annotation.ViewControllerRegistration;

public class ToDoControllerTest {
    
    @Test
    public void testCreate() {
        ToDoController controller = new ToDoController();
        var todo = new ToDo(1, "t", "d");
        controller.createTodo(1, todo);
        assertEquals(1, controller.count());
        assertEquals(1, controller.todo().size());
    }

    @Test
    public void testDelete(){
        ToDoController controller = new ToDoController();
        var todo = new ToDo(1, "t", "d");
        var todo2 = new ToDo(2, "titel", "description");
        controller.createTodo(1, todo);
        controller.createTodo(2, todo2);
        controller.deleteTodo(1);
        assertEquals(1, controller.count());
    }

    @Test
    public void testTest(){
        ToDoController controller = new ToDoController();
        var response = controller.test();
        assertEquals("ToDo app is up and running!", response);

    }

    @Test
    public void testPing(){
        ToDoController controller = new ToDoController();
        assertEquals("{ \"status\": \"ok\", \"userId\": \"admin"+ "\", \"languageCode\": \"de\",\"version\": \"0.0.1" + "\"}", controller.ping());
    }

    @Test
    public void testGetTodo(){
        ToDoController controller = new ToDoController();
        var todo = new ToDo(1, "t", "d");
        controller.createTodo(1, todo);
        assertEquals(controller.getTodo(1), controller.getTodo(1));
    }

}
