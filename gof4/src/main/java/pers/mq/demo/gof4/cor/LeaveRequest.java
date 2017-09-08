package pers.mq.demo.gof4.cor;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: mq
 * Date: 2017-09-08
 * Time: 下午1:54
 */
@Setter
@Getter
@AllArgsConstructor
public class LeaveRequest {

    private String leaveName;
    private int leaveDays;
}
