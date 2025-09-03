package todo_application;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ControllerTest {
    Controller controller = new Controller();

    @Test
    void getAllListTasksReturnsEmptyWhenNoListItemsPresent() {
        String expectedListItems = "[]";

        String actualListItems = controller.getAllTasks();

        assertEquals(expectedListItems, actualListItems);
    }

    @Test
    void getAllListTasksReturnsNonEmptyWhenListItemsPresent() {
        String expectedListItems = "[Test task]";

        controller.addTask("Test task");
        String actualListItems = controller.getAllTasks();

        assertEquals(expectedListItems, actualListItems);
    }

    @Test
    void getAllListTasksReturnsMultipleItemsWhenMultipleListItemsPresent() {
        String expectedListItems = "[Test task, Another test task]";

        controller.addTask("Test task");
        controller.addTask("Another test task");
        String actualListItems = controller.getAllTasks();

        assertEquals(expectedListItems, actualListItems);
    }
}
