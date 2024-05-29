package ioStream;

import java.awt.FileDialog;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.border.TitledBorder;

public class FileCopy  extends JFrame implements ActionListener {
	private JLabel jlOutput;
	private JButton jbtnCopy;
	
	public FileCopy() {
		super("파일 복사");
		jbtnCopy = new JButton("복사할 파일 선택");
		jlOutput = new JLabel("복사 할 파일을 선택해주세요.");
		JPanel jpCenter = new JPanel();
		jlOutput.setBorder( new TitledBorder("출력"));
		
		add("Center",jpCenter);
		add("South",jlOutput);
		add("North",jbtnCopy);
		jbtnCopy.addActionListener(this);
		
		setBounds(100, 100, 300, 400);
		setVisible(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		
	}//fileCopy
	
	public void fileCopy() throws IOException {
		//원본 파일명 얻기
		FileDialog fdopen = new FileDialog(this,"복사할 파일 선택",
		FileDialog.LOAD);
		fdopen.setVisible(true);
		
		if(fdopen.getDirectory()==null) {
			return;
		}
		
		File fileOrign = new File(fdopen.getDirectory()+fdopen.getFile());
	if(!fileOrign.exists()) {
		JOptionPane.showMessageDialog(this, "파일이 존재하지 않습니다.");
		return;
	}
	
	//복사할 파일명을 생성 : 원본파일명+_bak.확장자
	StringBuilder temp = new StringBuilder(fileOrign.getAbsolutePath());
	temp.insert(temp.lastIndexOf("."), "_bak");
	File copyedF = new File(temp.toString());
	
	FileInputStream fis = null;
	FileOutputStream fos =null;
	
	try {
		fis = new FileInputStream(fileOrign);
		fos = new FileOutputStream(copyedF);
		
		//HDD의 특성을 고려한 코드:
		//1.HDD 한번에 512byte를 읽어들여옴으로 그 값을 저장할 빈 배열을 생성
		byte[] data = new byte[512];
		//2.HDD에서 읽어들인 내용을 빈 배열에 저장하고 크기를 변수에 저장한다.
		int dataSize = 0;
		while((dataSize =fis.read(data)) != -1) {
			//3.배열에 값을 존재하는 크기까지만 스트림에 쓴다.
			fos.write(data,0,dataSize);
		}
		//4.스트림에 남은 내용을 목적지로 분출
		fos.flush();
		
		
		jlOutput.setText(copyedF.getName()+"파일명으로 복사가 되었습니다.");
		
	}finally {
		if(fis != null) {fis.close();}
		if(fos != null) {fos.close();}
	}
	
	
	}
	@Override
	public void actionPerformed(ActionEvent e) {
		try {
			if(e.getSource()==jbtnCopy)
			fileCopy();
		} catch (IOException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
	}

	public static void main(String[] args) {
		FileCopy fc = new FileCopy();

	}
}
