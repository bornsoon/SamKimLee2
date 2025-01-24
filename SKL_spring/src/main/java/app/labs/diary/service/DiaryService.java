package app.labs.diary.service;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import app.labs.diary.model.Diary;

public interface DiaryService {
	int getDiaryCount();
	int getDiaryCount(@Param("memberId") String memberId);
	List <Diary> getDiaryList(@Param("memberId") String memberId);
	Diary getDiaryInfo(int diaryId);
	void insertDiary(Diary diary);
	void updateDiary(Diary diary);
	int deleteDiary(@Param("diaryId") int diaryId);
}
