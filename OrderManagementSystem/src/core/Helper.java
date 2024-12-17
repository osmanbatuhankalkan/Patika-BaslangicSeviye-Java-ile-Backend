package core;

import javax.swing.*;

public class Helper {
    public static void setTheme(){
        for(UIManager.LookAndFeelInfo info : UIManager.getInstalledLookAndFeels()){
            if(info.getName().equals("Nimbus")){
                try{
                    UIManager.setLookAndFeel(info.getClassName());
                }catch(Exception e){
                    e.printStackTrace();
                }
            }
        }
    }
    public static boolean isFieldEmpty(JTextField field){
        return field.getText().trim().isEmpty();
    }
    public static boolean isFieldListEmpty(JTextField[] fields){
        for(JTextField field : fields){
            if(isFieldEmpty(field)){
                return true;
            }
        }
        return false;
    }
    public static boolean isEmailValid(String mail){
        //asdasfds @ dsfafa.com
        if(mail == null || mail.trim().isEmpty()){
            return false;
        }
        if(!mail.contains("@")){
            return false;
        }
        String[] parts = mail.split("@");
        if(parts.length != 2){
            return false;
        }
        if (parts[0].trim().isEmpty() || parts[1].trim().isEmpty()){
            return false;
        }
        if (!parts[1].contains(".")){
            return false;
        }
        return true;
    }
    public static void optionPaneDialogTR(){
        UIManager.put("OptionPane.okButtonText", "Tamam");
        UIManager.put("OptionPane.yesButtonText", "Yes");
        UIManager.put("OptionPane.noButtonText", "No");
    }

    public static void showMsg(String message){
        String msg;
        String title;

        optionPaneDialogTR();
        switch (message){
            case "fill" ->{
                msg="Lütfen tüm alanları doldurunuz!";
                title="Hata";
            }
            case "done" ->{
                msg="İşlem başarılu";
                title="Sonuc";

            }case "error" ->{
                msg="Bir Hata oluştu";
                title="Hata";
            }
            default ->{
                msg=message;
                title="Mesaj";
            }
        }
        JOptionPane.showMessageDialog(null, msg, title, JOptionPane.INFORMATION_MESSAGE);
    }
    public static boolean confirm(String str){
        optionPaneDialogTR();
        String msg;
        if (str.equals("sure")){
            msg="Bu işlemi gerçekleştirmek istediğine emin misin?";
        }else{
            msg=str;
        }
        return JOptionPane.showConfirmDialog(null,msg,"Emin misin",JOptionPane.YES_NO_OPTION)==0;
    }
}
