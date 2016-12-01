package com.company.dao;

import com.company.model.Director;

/**
 * Created by garkaviy on 29.11.2016.
 */
public class DirectorDao {

    private Director[] directors = new Director[0];

    //добавление директора
    public void add(Director director) {
        int idx = indexOf(director);
        // добавляем  директора, добавляем  новый массив  размером на 1  больше и присваеваем новый элемент как  №0
        // и копируем данные  из старого масиива остальные
        if (idx == -1) {
            Director[] tmp = new Director[directors.length + 1];
            tmp[0] = director;
            for (int i = 1; i < tmp.length; i++) {
                tmp[i] = directors[i - 1];
            }
            directors = tmp;
        } else {
            // если  значение  нашлось то не добавляем аа обновляем поля
            update(director);
        }
    }

    public int indexOf(Director director) {
        int idx = -1;
        for (int i = 0; i < directors.length; i++) {
            if (directors[i].getName().equals(director.getName())) {
                idx = i;
                break;

            }
        }
        return idx;
    }

    //вывести всех директоров
    public Director[] getAll() {
        return directors;

    }

    //удаление директора
    public void remove(Director director) {
        int idx = indexOf(director);
        // добавляем  директора, добавляем  новый массив  размером на 1  больше и присваеваем новый элемент как  №0
        // и копируем данные  из старого масиива остальные
        if (idx != -1) {
            Director[] tmp = new Director[directors.length - 1];
            for (int i = 0; i <directors.length ; i++) {
                if (idx > i) {
                    tmp[i] = directors[i];
                }
                if (idx != i && idx < i) {
                    tmp[i - 1] = directors[i];
                }
            }

            // если  значение  нашлось то не добавляем аа обновляем поля
            update(director);
        }
    }

//    public void remove(Director director) { //удаление директора
//        int idx = indexOf(director);
//        Director[] tmp = new Director[directors.length - 1];
//        int k = 0;
//        for (int i = 0; i < directors.length; i++) {
//            if (i == idx) {
//                continue;
//            }
//            tmp[k] = directors[i];
//            k++;
//        }
//        directors = tmp;
//    }



    //поиск по имени директора
    public Director findByName(String name) {
        for (int i = 0; i < directors.length; i++) {
            if (directors[i].getName().equals(name)) {
                return directors[i];
            }
        }
        return null;  // Выполнится если нет такого директора вернет ноль
    }






    //обновление данных директоров
    public void update(Director director){
      int idx = indexOf(director);
      if(idx != -1){
          directors[idx].setEmail(director.getEmail());
          directors[idx].setPhone(director.getPhone());
      }
    }


}
