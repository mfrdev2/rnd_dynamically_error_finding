import java.util.*;

public class UtilBean {
    public static List<DDBean> getDDBeanList(){
        return Arrays.asList(
                new DDBean("a","apple"),
                new DDBean("b","boll"),
                new DDBean("c","cat")

        );
    }

    public static List<DDBean> getSelectedDDList(){
        return Arrays.asList(
                new DDBean("a","apple"),
                new DDBean("c","boll")
        );
    }

    public static List<String> getIdList(List<DDBean> ddBeanList){
       return ddBeanList.stream().map(m->m.getId()).toList();
    }

    public static UtilModel getErrorMessage(){
        List<String> shouldHaveThoseIds = getIdList(getDDBeanList());
        System.out.println(shouldHaveThoseIds);
        for (String id: shouldHaveThoseIds){
           if(isError(id)){
               DDBean item = getItem2(id);
               System.out.println(item.getTitle() + " is missing");
           }
        }
        return null;
    }

    public static boolean isError(String id){
       for (DDBean dd : getSelectedDDList()){
           if (dd.getId().equals(id)) {
               return false;
           }
       }
       return true;
    }

    public static DDBean getItem2(String id){
     return getDDBeanList().stream()
                .filter(dd -> dd.getId().equals(id))
                .findAny()
                .orElse(null);
    }
}
