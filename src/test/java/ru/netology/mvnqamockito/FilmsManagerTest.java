package ru.netology.mvnqamockito;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class FilmsManagerTest {
    @Test
    public void addThreeFilms() {
        FilmsManager manager = new FilmsManager();
        manager.addFilms("Movie I");
        manager.addFilms("Movie II");
        manager.addFilms("Movie III");
        String[] actual = manager.findAll();
        String[] expected = {"Movie I", "Movie II", "Movie III"};
        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void addOneFilms() {
        FilmsManager manager = new FilmsManager();
        manager.addFilms("Movie I");
        String[] actual = manager.findAll();
        String[] expected = {"Movie I"};
        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void addNullFilms() {
        FilmsManager manager = new FilmsManager();

        String[] actual = manager.findAll();
        String[] expected = {};
        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void findLastFilmLimit() {
        FilmsManager manager = new FilmsManager();

        manager.addFilms("Movie I");
        manager.addFilms("Movie II");
        manager.addFilms("Movie III");
        String[] actual = manager.findLast();
        String[] expected = {"Movie III", "Movie II", "Movie I"};
        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void findLastFilmBoundaryValue1() {
        FilmsManager manager = new FilmsManager();


        String[] actual = manager.findLast();
        String[] expected = {};
        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void findLastFilmBoundaryValue2() {
        FilmsManager manager = new FilmsManager();

        manager.addFilms("Movie I");
        manager.addFilms("Movie II");
        manager.addFilms("Movie III");
        manager.addFilms("Movie IV");
        manager.addFilms("Movie V");
        String[] actual = manager.findLast();
        String[] expected = {"Movie V", "Movie IV", "Movie III", "Movie II", "Movie I"};
        Assertions.assertArrayEquals(expected, actual);
    }


    @Test
    public void findLastFilmBoundaryValue3() {
        FilmsManager manager = new FilmsManager();

        manager.addFilms("Movie I");
        manager.addFilms("Movie II");
        manager.addFilms("Movie III");
        manager.addFilms("Movie IV");
        manager.addFilms("Movie V");
        manager.addFilms("Movie VI");
        manager.addFilms("Movie VII");
        String[] actual = manager.findLast();
        String[] expected = {"Movie VII", "Movie VI", "Movie V", "Movie IV", "Movie III"};
        Assertions.assertArrayEquals(expected, actual);
    }
}
