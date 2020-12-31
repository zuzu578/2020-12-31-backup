package com.exhibition.project.BoardDao;

import java.util.ArrayList;

import com.exhibition.project.BoardDto.BoardDto;




public interface BoardDao {
	
	public ArrayList<BoardDto> list( );
	public ArrayList<BoardDto> previous();
	public void write(String userid, String boardtopic, String board_comment);
	public BoardDto board_view(int board_num);
	//public BDto contentView(int bId);
	public BoardDto listPage();
	public void Doboard_update(int board_num,String userid , String boardtopic ,String board_comment);
	public void Doboard_delete(int board_num);
	public void upHit(int board_num);
	public int loginCheck(String id, String passwd);
	
	
	
	public void reply(String userid, String boardtopic, String board_comment, int bGroup, int bStep, int bIndent);
	public void replyShape(int bGroup, int bStep);
	public BoardDto contentView(int board_num);
	//report//
	public void try_report(String userid, String boardTitle, String board_comment,String report_comment);
	
	
	
	
//	public BDto reply_view(int bId);
//	public void reply(String bName,String bTitle,String bContent,int bGroup,int bStep,int bIndent);
//	public void replyShape(int bGroup ,int bStep);
	
	
	
	
	
	
	
}
