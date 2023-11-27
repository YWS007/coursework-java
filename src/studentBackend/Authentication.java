package studentBackend;

import java.util.ArrayList;

public class Authentication extends FileHandling {

    public int registration(String studentID, String password, String gender, boolean isAdmin) {
        ArrayList<String[]> userInfo = this.convertData(this.readFile("studentData.txt"));

        for (String[] str : userInfo) {
            if (str[0].equals(studentID)) {
                return 1;
            }
        }
        this.writeFile("studentData.txt", studentID + " " + password + " " + gender + " " + isAdmin);
        return 0;
    }

    public int checkLogin(String studentID, String password) {
        ArrayList<String[]> userInfo = this.convertData(this.readFile("studentData.txt"));
        for (String[] str : userInfo) { //loop through elements in an array
            if (str[0].equals(studentID)) {
                if (str[1].equals(password)) {
                    if (str[3].equals("false")) {
                        return 0;
                    } else {
                        return -1;
                    }
                } else {
                    return 1;
                }
            }
        }
        return 2;
    }
}
