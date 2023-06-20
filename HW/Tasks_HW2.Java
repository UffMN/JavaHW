
'''
public class Task1 {
    public static void main(String[] args) {
        String text = "{\"name\":\"Ivanov\", \"country\":\"Russia\", \"city\":\"null\", \"age\":\"26\"}";
        String text1 = text.substring(1, text.length() - 1);
        String[] keyWithValue = text1.split(", ");
        StringBuilder res = new StringBuilder();
        boolean flag = true;

        for (String item : keyWithValue) {
            String[] keyValue = item.split(":" );
            String key = keyValue[0].replace("\"", ""); 
            String value = keyValue[1].replace("\"", ""); 
            if (!value.equalsIgnoreCase("null")) {
                if(flag==false)
                res.append(" AND ");
            res.append(key).append("=").append(value);
            flag = false; 
            }  
        }
        String sql = "SELECT * FROM students WHERE " + res.toString();
        System.out.println(sql);          
    }
}
'''
'''
public class Task2 {
    public static void main(String[] args) {
        int[] array = new int[] {9, 7, 6, 4, 2, 1};
        int temp;
        for (int i = array.length-1; i >0; i--) {
            for (int j = 0; j < i; j++) {
                if (array[j]>array[j+1]){
                    temp = array[j];
                    array[j]=array[j+1];
                    array[j+1]=temp;
                }
            }
            for (int j2 = 0; j2 < array.length; j2++) {
                System.out.print(array[j2]);
            }
            System.out.println("\n");
        }
    }
}
'''