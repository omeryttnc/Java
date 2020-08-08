package Codinbat.Functional_1;

import java.util.Collection;
import java.util.List;
import java.util.stream.Collectors;

/*
Given a list of strings, return a list where each string is replaced by 3 copies of the string concatenated together.


copies3(["a", "bb", "ccc"]) → ["aaa", "bbbbbb", "ccccccccc"]
copies3(["24", "a", ""]) → ["242424", "aaa", ""]
copies3(["hello", "there"]) → ["hellohellohello", "theretherethere"]
*/
public  class Copies3 {
    public List<String> copies3(List<String> strings) {
        for (int i = 0; i <strings.size() ; i++) {
            strings.set(i,strings.get(i)+strings.get(i)+strings.get(i));
        }
            return strings;
    }
}

