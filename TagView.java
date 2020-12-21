package ProjectOOP.src.View;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.Frame;
import java.awt.List;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;
import java.io.File;
import java.lang.ModuleLayer.Controller;
import java.util.ArrayList;
import javax.swing.*;
import javax.swing.filechooser.FileSystemView;


public class TagView{
	public static void CreateTagWindow()
	{    JPanel panelView;
		 DefaultListModel tagListModel = new DefaultListModel();
		 JButton acceptButton = new JButton("Accept");	
		 
		 tagListModel.addElement("GroupVin");
		 tagListModel.addElement("GroupTopBank");
		 tagListModel.addElement("Tag 3");
		 tagListModel.addElement("Tag 4");
		 tagListModel.addElement("Tag 5");
		 
		 JList tagList = new JList(tagListModel);
		 tagList.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION); 
		 JScrollPane scrollPane = new JScrollPane(tagList);	 
		 scrollPane.setBounds(100, 100, 300, 200);
		 
		 
	    panelView = new JPanel();
	    panelView.add(scrollPane);
	    
	    acceptButton.addActionListener(new ActionListener() {
	    			
			@Override
			public void actionPerformed(ActionEvent e) {
				if (tagList.getSelectedIndex()!=-1) 
		         { 	String getTagString=String.valueOf(tagList.getSelectedValuesList()).replace("[", "").replace("]", "");				
					ViewBase.inputTextField.setText(getTagString);
					ViewBase.userInputString=getTagString;
					ProjectOOP.src.Controller.Controller.request();
		         }
			}});
	    
	    JFrame createFrame = new JFrame("Chon Tag"); 
		acceptButton.setBackground(new Color(102,178,255));
		acceptButton.setBounds(200, 100, 80, 50);
		
		createFrame.setSize(600, 400);
		createFrame.add(acceptButton);
		createFrame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		createFrame.addWindowListener(new WindowListener() {
			
			@Override
			public void windowOpened(WindowEvent e) {
				// TODO Auto-generated method stub
				
			}
			
			@Override
			public void windowIconified(WindowEvent e) {
				// TODO Auto-generated method stub
				
			}
			
			@Override
			public void windowDeiconified(WindowEvent e) {
				// TODO Auto-generated method stub
				
			}
			
			@Override
			public void windowDeactivated(WindowEvent e) {
				// TODO Auto-generated method stub
				
			}
			
			@Override
			public void windowClosing(WindowEvent e) {
				// TODO Auto-generated method stub
				
			}
			
			@Override
			public void windowClosed(WindowEvent e) {
			ViewBase.countTagView--;
				
			}
			
			@Override
			public void windowActivated(WindowEvent e) {
				// TODO Auto-generated method stub
				
			}
		});
		createFrame.add(scrollPane);		
		createFrame.add(acceptButton,BorderLayout.EAST);
		createFrame.setVisible(true);
	}
}

