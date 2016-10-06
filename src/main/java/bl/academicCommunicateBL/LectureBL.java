package bl.academicCommunicateBL;

import ENUM.UniversalState;
import blservice.academicCommunicateBLService.LectureBLService;
import vo.AcademicVO;

import java.util.ArrayList;

/**
 * Created by lvdechao on 2016/10/6.
 */
public class LectureBL implements LectureBLService{

    public int getID() {

        return 1;
    }

    public String addItem(AcademicVO academicVO) {
        return null;
    }

    public UniversalState deleteItem(int id) {
        System.out.println("删除"+id);
        return UniversalState.SUCCEED;
    }

    public UniversalState updateItem(AcademicVO academicVO) {

        System.out.println(academicVO.getId());
        System.out.println(academicVO.getTitle());
        System.out.println(academicVO.getAuthor());
        System.out.println(academicVO.getLocation());
        System.out.println(academicVO.getLanguage());
        return UniversalState.SUCCEED;
    }
    public AcademicVO getItem(int id) {
        AcademicVO academicVO=new AcademicVO();
        academicVO.setId(0);
        academicVO.setAuthor("zhangsan");
        academicVO.setLocation("/test/a.html");
        academicVO.setTitle("ceshiceshi");
        academicVO.setPageView(0);
        academicVO.setTime("2010-1-1");
        return academicVO;
    }

    public ArrayList<AcademicVO> getAllItems(String language) {
        ArrayList<AcademicVO> result=new ArrayList<AcademicVO>();
        AcademicVO academicVO=new AcademicVO();
        academicVO.setId(0);
        academicVO.setAuthor("zhangsan");
        academicVO.setLocation("/test/a.html");
        academicVO.setTitle("ceshiceshi");
        academicVO.setPageView(0);
        academicVO.setTime("2010-1-1");
        result.add(academicVO);
        AcademicVO academicVO2=new AcademicVO();
        academicVO2.setId(1);
        academicVO2.setAuthor("zhangsan");
        academicVO2.setLocation("/test/a.html");
        academicVO2.setTitle("ceshiceshi");
        academicVO2.setPageView(0);
        academicVO2.setTime("2010-1-1");
        result.add(academicVO2);
        return result;
    }
}
