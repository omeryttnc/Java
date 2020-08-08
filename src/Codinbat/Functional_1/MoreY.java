package Codinbat.Functional_1;

import java.util.List;
import java.util.stream.Collectors;

/*
Given a list of strings, return a list where each string has "y" added at its start and end.


moreY(["a", "b", "c"]) → ["yay", "yby", "ycy"]
moreY(["hello", "there"]) → ["yhelloy", "ytherey"]
moreY(["yay"]) → ["yyayy"]
 */
public class MoreY {
    public List<String> moreY(List<String> strings) {
        for (int i = 0; i <strings.size() ; i++) {
            strings.set(i,"y"+strings.get(i)+"y");
        }
        return strings;
    }



}
