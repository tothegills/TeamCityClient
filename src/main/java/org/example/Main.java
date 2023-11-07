package org.example;

import org.jetbrains.teamcity.rest.TeamCityInstance;
import org.jetbrains.teamcity.rest.TeamCityInstanceFactory;
import org.jetbrains.teamcity.rest.Build;
import org.jetbrains.teamcity.rest.Change;
import java.util.List;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        final TeamCityInstance tcInstance =
                TeamCityInstanceFactory.httpAuth("http://localhost:8111", "admin", "password");
        final Build build = tcInstance.builds().latest();
        final List<Change> changes = build.getChanges();

        System.out.println(changes.size());
    }
}