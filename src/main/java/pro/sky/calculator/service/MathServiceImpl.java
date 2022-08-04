package pro.sky.calculator.service;

import org.springframework.stereotype.Service;

@Service
public class MathServiceImpl implements MathService {
    @Override
    public String getSum(Long num1,Long num2) {
        return num1 + "+" + num2 + "=" + (num1 + num2);
    }

    @Override
    public String getDifference(Long num1, Long num2) {
        return num1 + "-" + num2 + "=" + (num1 - num2);
    }

    @Override
    public String getMultiply(Long num1, Long num2) {
        return num1 + "*" + num2 + "=" + (num1 * num2);
    }

    @Override
    public String getDivide(Long num1, Long num2) {
        if (num2 == 0){
            return "На ноль делить нельзя";
        }
        else {
            return num1 + "/" + num2 + "=" + (num1 / num2);
        }
    }
}
