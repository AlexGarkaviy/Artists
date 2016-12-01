package com.company.dao;

import com.company.model.Artist;


/**
 * Created by garkaviy on 29.11.2016.
 */
public class ArtistDao {
    private Artist[] artists = new Artist[0];

    //добавление артиста
    public void add(Artist artist) {
        int idx = indexOf(artist);
        // добавляем  артиста, добавляем  новый массив  размером на 1  больше и присваеваем новый элемент как  №0
        // и копируем данные  из старого масиива остальные
        if (idx == -1) {
            Artist[] tmp = new Artist[artists.length + 1];
            tmp[0] = artist;
            for (int i = 1; i < tmp.length; i++) {
                tmp[i] = artists[i - 1];
            }
            artists = tmp;
        } else {
            // если  значение  нашлось то не добавляем аа обновляем поля
            update(artist);
        }
    }

    public int indexOf(Artist artist) {
        int idx = -1;
        for (int i = 0; i < artists.length; i++) {
            if (artists[i].getName().equals(artist.getName())) {
                idx = i;
                break;

            }
        }
        return idx;
    }

    //вывести всех артистов
    public Artist[] getAll() {
        return artists;

    }

    //удаление артиста
    public void remove(Artist artist) {
        int idx = indexOf(artist);
        // добавляем  артиста, добавляем  новый массив  размером на 1  больше и присваеваем новый элемент как  №0
        // и копируем данные  из старого масиива остальные
        if (idx != -1) {
            Artist[] tmp = new Artist[artists.length - 1];
            for (int i = 0; i <artists.length ; i++) {
                if (idx > i) {
                    tmp[i] = artists[i];
                }
                if (idx != i && idx < i) {
                    tmp[i - 1] = artists[i];
                }
            }

            // если  значение  нашлось то не добавляем аа обновляем поля
            update(artist);
        }
    }

    //поиск по имени директора
    public Artist findByName(String name) {
        for (int i = 0; i < artists.length; i++) {
            if (artists[i].getName().equals(name)) {
                return artists[i];
            }
        }
        return null;  // Выполнится если нет такого артиста вернет ноль
    }

    //обновление данных артистов
    public void update(Artist artist){
        int idx = indexOf(artist);
        if(idx != -1){
            artists[idx].setName(artist.getName());
            artists[idx].setAbout(artist.getAbout());
        }
    }


}


