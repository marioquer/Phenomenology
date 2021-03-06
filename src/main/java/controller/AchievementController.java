package controller;

import ENUM.UniversalState;
import bl.academicSourceBL.CathedraBL;
import bl.achievementBL.ArticleBL;
import bl.achievementBL.BookBL;
import blservice.academicSourceBLService.CathedraBLService;
import blservice.achievementBLService.ArticleBLService;
import blservice.achievementBLService.BookBLService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import vo.AcademicVO;
import vo.AchievementVO;

import java.util.ArrayList;

/**
 * Created by lvdechao on 2016/10/3.
 */

@Controller
@RequestMapping(value = "/achievement")
public class AchievementController {

    @RequestMapping(value = "/article/getID", method = RequestMethod.POST)
    @ResponseBody
    public int getArticleID() {
        ArticleBLService articleBLService=new ArticleBL();
        return articleBLService.getID();
    }

    @RequestMapping(value = "/article/update", method = RequestMethod.POST)
    @ResponseBody
    public String updateArticle(int id,String title,String thumbnailLocation,
                                String descriptionLocation,String language) {

        AchievementVO achievementVO=new AchievementVO();
        achievementVO.setId(id);
        achievementVO.setTitle(title);
        achievementVO.setThumbnailLocation(thumbnailLocation);
        achievementVO.setDescriptionLocation(descriptionLocation);
        achievementVO.setLanguage(language);
        ArticleBLService articleBLService=new ArticleBL();
        UniversalState universalState=articleBLService.updateItem(achievementVO);
        return universalState.toString();
    }
    @RequestMapping(value = "/article/delete", method = RequestMethod.POST)
    @ResponseBody
    public String deleteArticle(int id) {
        ArticleBLService articleBLService=new ArticleBL();
        UniversalState universalState=articleBLService.deleteItem(id);
        return universalState.toString();
    }

    @RequestMapping(value = "/article/getOne", method = RequestMethod.GET)
    @ResponseBody
    public AchievementVO getArticle(int id) {
        ArticleBLService articleBLService=new ArticleBL();
        return articleBLService.getItem(id);
    }

    @RequestMapping(value = "/article/get", method = RequestMethod.GET)
    @ResponseBody
    public ArrayList<AchievementVO> getArticle(String language) {
        ArticleBLService articleBLService=new ArticleBL();
        return articleBLService.getAllItems(language);
    }

    @RequestMapping(value = "/book/getID", method = RequestMethod.POST)
    @ResponseBody
    public int getBookID() {
        BookBLService bookBLService=new BookBL();
        return bookBLService.getID();
    }

    @RequestMapping(value = "/book/update", method = RequestMethod.POST)
    @ResponseBody
    public String updateBook(int id,String title,String thumbnailLocation,
                                String descriptionLocation,String language) {

        AchievementVO achievementVO=new AchievementVO();
        achievementVO.setId(id);
        achievementVO.setTitle(title);
        achievementVO.setThumbnailLocation(thumbnailLocation);
        achievementVO.setDescriptionLocation(descriptionLocation);
        achievementVO.setLanguage(language);
        BookBLService bookBLService=new BookBL();
        UniversalState universalState=bookBLService.updateItem(achievementVO);
        return universalState.toString();
    }
    @RequestMapping(value = "/book/delete", method = RequestMethod.POST)
    @ResponseBody
    public String deleteBook(int id) {
        BookBLService bookBLService=new BookBL();
        UniversalState universalState=bookBLService.deleteItem(id);
        return universalState.toString();
    }

    @RequestMapping(value = "/book/getOne", method = RequestMethod.GET)
    @ResponseBody
    public AchievementVO getBook(int id) {
        BookBLService bookBLService=new BookBL();
        return bookBLService.getItem(id);
    }

    @RequestMapping(value = "/book/get", method = RequestMethod.GET)
    @ResponseBody
    public ArrayList<AchievementVO> getBook(String language) {
        BookBLService bookBLService=new BookBL();
        return bookBLService.getAllItems(language);
    }
}
