package StudentManagementSystem;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

public class Turing implements Serializable {
    private List<Group> groups;

    public Turing(){
        this.groups = new ArrayList<>();
    }

    public void addGroup(Group group){
        groups.add(group);
    }

}
