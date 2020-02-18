package Task1;

import Task1.Finder;
import Task1.Member;
import Task1.MembersGroup;
import java.util.Arrays;
import java.util.List;

import java.util.ArrayList;
class Test {
    public final static int TARGET_AGE = 40;
    public static final String FIRST_GROUP = "FirstGroup";
    public static final String SECOND_GROUP = "SecondGroup";
    public static final String THIRD_GROUP = "ThirdGroup";

    public static final List<Member> membersOne =
            Arrays.asList(
                    new Member("Ann", 25)
                    , new Member("Abbey", 25)
                    , new Member("Bob", 50)
                    , new Member("Zoe", 100)
            );

    public static final List<Member> membersTwo =
            Arrays.asList(
                    new Member("John", 36),
                    new Member("Ivan", 71),
                    new Member("Mary", 25),
                    new Member("Tony", 18)
            );

    public static final List<Member> membersThree =
            Arrays.asList(
                    new Member("Clara", 29),
                    new Member("Evan", 30),
                    new Member("Thomas", 15),
                    new Member("Qumar", 21)
            );

    public static MembersGroup makeMembersGroup(String groupName, List<Member> members) {
        return new MembersGroup(groupName, members);
    }

    public static Finder makeFinder() {
        return new Finder();
    }

    public static List<MembersGroup> makeMembersGroupList() {
        MembersGroup groupOne = Test.makeMembersGroup(FIRST_GROUP, membersOne);
        MembersGroup groupTwo = Test.makeMembersGroup(SECOND_GROUP, membersTwo);
        MembersGroup groupThree = Test.makeMembersGroup(THIRD_GROUP, membersThree);
        return Arrays.asList(groupOne, groupTwo, groupThree);
    }

    public static void main(String[] args) {
        System.out.println(makeFinder().findOldMembers(makeMembersGroupList(), TARGET_AGE));
    }
}
