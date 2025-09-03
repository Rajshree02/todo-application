package todo_application;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.ArrayList;

public class Controller {
    ArrayList<String> list = new ArrayList<>();

    @RequestMapping("/tasks")
    @ResponseBody
    public String getAllTasks() {
        return list.toString();
    }

    @RequestMapping(value = "/addTask", method = RequestMethod.POST)
    @ResponseBody
    public String addTask(String taskName) {
        list.add(taskName);
        return String.format("%s added", taskName);
    }
}
