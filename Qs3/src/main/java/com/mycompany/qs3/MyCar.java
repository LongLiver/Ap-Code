/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Q3;
import Qs3.Car;
import Qs3.ICar;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

/**
 *
 * @author tuan
 */
public class MyCar implements ICar{

    /**
     *
     * @param t
     * @return
     */
    @Override
    public int f1(List<Car> t) {
        double sum = 0;
        int carCount = t.size();
        for (int i = 0; i < carCount; i++) {
            sum += t.get(i).getRate();
        }
        return (int) (sum / carCount);
    }

    /**
     *
     * @param t
     */
    @Override
    public void f2(List<Car> t){
        // tìm vị trí thằng nhỏ nhất đầu tiên
        int indexMin = getIndexMinRate(t);
        // tìm vị trí thằng lớn nhất đầu tiên
        int indexMax = getIndexMaxRate(t);
        // đổi chỗ 2 thằng cho nhau
        Car carTemp = t.get(indexMin);
        t.set(indexMin, t.get(indexMax));
        t.set(indexMax, carTemp);
    }
    //  7 9 8 5 

    /**
     *
     * @param t
     */
    @Override
    public void f3(List<Car> t) {
        Comparator<Car> comparator = (Car t1, Car t2) -> {
            int alphabe = t1.getMaker().compareTo(t2.getMaker());
            if (alphabe == 0) {
                if (t1.getRate() > t2.getRate()) {
                    return -1;
                } else if (t1.getRate() == t2.getRate()) {
                    return 0;
                } else {
                    return 1;
                }
            } else {
                return alphabe;
            }
        };
        Collections.sort(t, comparator);
    }

    private int getIndexMinRate(List<Car> t) {
        int valueMin = t.get(0).getRate();
        int indexMin = 0;
        for (int i = 1; i < t.size(); i++) {
            if (t.get(i).getRate() < valueMin) {
                valueMin = t.get(i).getRate();
                indexMin = i;
            }
        }
        return indexMin;
    }

    private int getIndexMaxRate(List<Car> t) {
        int valueMax = t.get(0).getRate();
        int indexMax = 0;
        for (int i = 1; i < t.size(); i++) {
            if (t.get(i).getRate() > valueMax) {
                valueMax = t.get(i).getRate();
                indexMax = i;
            }
        }
        return indexMax;
    }
}
