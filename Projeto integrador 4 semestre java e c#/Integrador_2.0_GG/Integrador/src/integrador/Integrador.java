package integrador;
import br.com.gabrielmelo.storemusic.Formularios.LoginTeste;
import br.com.gabrielmelo.storemusic.Utilitarios.Conexao;


public class Integrador {

   
    public static void main(String[] args){

        
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(LoginTeste.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(LoginTeste.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(LoginTeste.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(LoginTeste.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        
        Conexao c = new Conexao();
        c.conectar();
        LoginTeste frmLogin = new LoginTeste();
        frmLogin.show();
    }
}
        
