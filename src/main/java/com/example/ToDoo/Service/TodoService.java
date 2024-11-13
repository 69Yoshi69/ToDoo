//package com.example.ToDoo.Service;
//
//
//import com.example.ToDoo.Repo.Reposit;
//import com.example.ToDoo.model.ToDo;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.stereotype.Service;
//
//import java.util.ArrayList;
//import java.util.List;
//
//@Service
//public class TodoService {
//
//    @Autowired
//    private Reposit repo;
//
//    public List<ToDo> getAllToDoItems(){
//        ArrayList<ToDo> todoList = new ArrayList<>();
//        repo.findAll().forEach(todoList::add);
//        return todoList;
//    }
//
//    public ToDo getToDoItemById(Long id) {
//        return repo.findById(id).get();
//    }
//
//    public boolean updateStatus(Long id) {
//        ToDo todo = getToDoItemById(id);
//        todo.setStatus("Completed");
//
//        return saveOrUpdateToDoItem(todo);
//    }
//
//    public boolean saveOrUpdateToDoItem(ToDo todo) {
//        ToDo updateObj = repo.save(todo);
//        if (getToDoItemById(updateObj).getId()) != null){
//            return true;
//        }
//        return false;
//    }
//
//    public boolean deleteToDoItem(Long id) {
//        repo.deleteById(id);
//        if(getAllToDoItemById(id)) = null) {
//            return true;
//        }
//        return false;
//
//    }
//}
//
