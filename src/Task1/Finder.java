package Task1;

import Task1.Member;
import Task1.MembersGroup;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Finder {
    /**
     * Поиск групп людей старше определенного возраста используя Stream API.
     *
     * @param groups группы
     * @param targetAge возраст для поиска
     * @return список имен групп из списка групп старше возраста targetAge
     */
    public Set<String> findOldMembers(List<MembersGroup> groups, int targetAge) {
        return groups.stream() // List<MembersGroup> преобразуется в Stream<MembersGroup>
                .flatMap(membersGroup -> membersGroup.getMembers().stream()) // Stream<MembersGroup> преобразуется в Stream<Members>
                .filter(member -> member.getAge() > targetAge) // Происходит фильтрация по возрасту внутри Stream<Members>, оставляя в нем только подходящих Member`ов
                .map(Member::getName) // Преобразование Stream<Member> в Stream<String>, в соотв. с заданной ф-цией
                .collect(Collectors.toSet()); // Преобразование  Stream в Set
    }


}
