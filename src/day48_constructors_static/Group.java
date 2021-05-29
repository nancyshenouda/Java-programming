package day48_constructors_static;

import java.util.ArrayList;
import java.util.List;

public class Group {
    private String groupName;
    private List<String> members = new ArrayList<>();


    public Group(String name){
        this.groupName=name;

    }


    public void addMember(String newMember){
      members.add(newMember);
    }
    public void removeMember(String memberName){
        members.remove(memberName);
    }


    public String toString() {
        return "Group{" +
                "groupName='" + groupName + '\'' +
                ", members=" + members +
                '}';
    }

    public String getGroupName() {
        return groupName;
    }

    public void setGroupName(String groupName) {
        this.groupName = groupName;
    }

    public List<String> getMembers() {
        return members;
    }

    public void setMembers(List<String> members) {
        this.members = members;
    }
}
