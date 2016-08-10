/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.gabrielmelo.storemusic.Utilitarios;

import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.text.DecimalFormat;
import java.util.Calendar;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.Timer;

/**
 *
 * @author aluno
 */
public class Estudos extends JFrame{
    JLabel hora;  
  Timer timer; 
  DecimalFormat formato;

  public Estudos() {
    super("Usando timers em Java");
    
    Container c = getContentPane();
    c.setLayout(new FlowLayout(FlowLayout.LEFT));

    formato = new DecimalFormat("00"); 

    // Cria o timer
    timer = new Timer(1000, new ActionListener(){
      public void actionPerformed(ActionEvent e){
        atualizarHoras();
      }
    });

    // Cria um botão com o texto "Iniciar"
    JButton iniciar = new JButton("Iniciar");
    iniciar.addActionListener(
      new ActionListener(){
        public void actionPerformed(ActionEvent e){
          timer.start(); // inicia o timer
        }
      }
    );    

    // Cria um botão com o texto "Parar"
    JButton parar = new JButton("Parar");
    parar.addActionListener(
      new ActionListener(){
        public void actionPerformed(ActionEvent e){
          timer.stop(); // pára o timer
        }
      }
    );
    
    // JLabel que exibirá a hora atual
    hora = new JLabel("00:00:00");

    // Adiciona os botões à janela
    c.add(iniciar);
    c.add(parar);

    // adiciona o label à janela
    c.add(hora);  

    setSize(350, 250);
    setVisible(true);
  }
  
  private void atualizarHoras(){
    // Cria uma instância de Calendar
    Calendar agora = Calendar.getInstance();    

    // horas, minutos e segundos
    int horas = agora.get(Calendar.HOUR);  
    int minutos = agora.get(Calendar.MINUTE);
    int segundos = agora.get(Calendar.SECOND);
    hora.setText(formato.format(horas) + ":" + 
      formato.format(minutos) + ":" + 
      formato.format(segundos));
  }

  public static void main(String args[]){
    Estudos app = new Estudos();
    app.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    
  }
}
