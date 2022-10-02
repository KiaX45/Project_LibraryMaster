
package Library;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.StringTokenizer;


public class Data {
//------------------------------------------------------------------------------
protected ArrayList<String[]> users;//id, name, telephone, state, visible, amounth, image
protected ArrayList<String[]> books;
protected ArrayList<String[]> magazines;
protected ArrayList<String[]> admins;

//------------------------------------------------------------------------------

    public Data() {
        users = new ArrayList<>();
        books = new ArrayList<>();
        magazines = new ArrayList<>();
        admins = new ArrayList<>();
    }

    public ArrayList<String[]> getUsers() {
        return users;
    }

    public ArrayList<String[]> getBooks() {
        return books;
    }

    public ArrayList<String[]> getMagazines() {
        return magazines;
    }

    public ArrayList<String[]> getAdmins() {
        return admins;
    }
//------------------------------------------------------------------------------
//Methods Users
public void loadUsers() {
        File file = new File("data2.0/users.data");
        try {
            Scanner scan = new Scanner(file);
            while (scan.hasNextLine()) {
                String line = scan.nextLine();
                StringTokenizer tokens = new StringTokenizer(line, "|");
                String fields[] = new String[7];
                for (int i = 0; i < 7; i++) {
                    fields[i] = tokens.nextToken();
                }
                users.add(fields);
            }
        } catch (FileNotFoundException e) {
            System.out.println(e.getMessage());
        }
}
//------------------------------------------------------------------------------
public void saveUser() {
        try {
            try (FileWriter file = new FileWriter("data2.0/users.data")) {
                for (String[] user : users) {
                    String tokens = "";
                    for (String field : user) {
                        tokens += field + "|";
                    }
                    file.write(tokens);
                    file.write("\n");
                }
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

    }
//------------------------------------------------------------------------------
public void addUser(String id, String name, String telephone, String state, String visible, String Amount, String path){
    System.out.println("State" + state);
    String fileds[] = {id,name,telephone,state, visible,Amount, path};
    users.add(fileds);
}    
//------------------------------------------------------------------------------
public boolean exist(String id){
    for (String[] fields : users) {
        if(fields[0].equals(id)){
            return true;
        }
    }
    
    return false;
}
//------------------------------------------------------------------------------
public String[] getUser(String id){
    for (String[] fields : users) {
        if(fields[0].equals(id)){
            return fields;
        }
    }
    
    
   return null; 
}

    
   
}
