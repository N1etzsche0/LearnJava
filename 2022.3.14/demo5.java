public class demo5 {
    public static void main(String[] args) {
        String[] fields = { "name", "position", "salary" };
        String table = "employee";
        String insert = buildInsertSql(table, fields);
        System.out.println(insert);
        System.out.println(
                "INSERT INTO employee (name, position, salary) VALUES (?, ?, ?)".equals(insert) ? "测试成功" : "测试失败");
    }

    static String buildInsertSql(String table, String[] fields) {
        // TODO:
        // String S;
        var S = new StringBuilder(1024);
        S.append("INSERT INTO ").append(table + "(");
        for (int i = 0; i < fields.length; i++) {
            if (i == 0) {
                S.append("fields[i]");
            } else {
                S.append(", " + fields[i]);
            }
        }
        S.append(")VALUES(?,?,?)");
        System.out.println(S);
        return "" + S;
    }

}
