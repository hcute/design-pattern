package hcute.hoo.design.pattern.creational.prototype;

public class Test {

    public static void main(String[] args) throws CloneNotSupportedException {
        Mail mail = new Mail();
        mail.setContent("初始化的模版");
        System.out.println("初始化mail：" + mail.toString());
        for (int i = 0; i < 10; i++) {
            Mail mailTemp = (Mail) mail.clone();
            mailTemp.setName("姓名" + i);
            mailTemp.setEmailAddress("姓名" + i + "@immoc.com");
            mailTemp.setContent("恭喜您，此次慕课网活动中奖了");
            System.out.println("循环mail" + i + "："  + mailTemp.toString());
            MailUtil.sendMail(mailTemp);
        }
        MailUtil.saveOriginMailRecord(mail);
    }
}
