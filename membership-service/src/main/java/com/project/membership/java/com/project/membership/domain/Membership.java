package com.project.membership.java.com.project.membership.domain;

import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Value;

@AllArgsConstructor(access = AccessLevel.PRIVATE)
public class Membership {

    @Getter
    private final String membershipId;

    @Getter
    private final String name;

    @Getter
    private final String email;

    @Getter
    private final String address;

    @Getter
    private final boolean isValid;

    @Getter
    private final boolean isCorp;

    public static Membership generateMember(
        MembershipId membershipId,
        MembershipName membershipName,
        MembershipEmail membershipEmail,
        MembershipAddress membershipAddress,
        MembershipIsValid membershipIsValid,
        MembershipIsCorp membershipIsCorp
    ) {
        return new Membership(
            membershipId.membershipId,
            membershipName.membershipName,
            membershipEmail.membershipEmail,
            membershipAddress.membershipAddress,
            membershipIsValid.membershipIsValid,
            membershipIsCorp.membershipIsCorp
            );
    }

    @Value
    public static class MembershipId {

        String membershipId;

        public MembershipId(String value) {
            this.membershipId = value;
        }
    }

    @Value
    public static class MembershipName {

        String membershipName;

        public MembershipName(String value) {
            this.membershipName = value;
        }
    }

    @Value
    public static class MembershipEmail {

        String membershipEmail;

        public MembershipEmail(String value) {
            this.membershipEmail = value;
        }
    }

    @Value
    public static class MembershipAddress {

        String membershipAddress;

        public MembershipAddress(String value) {
            this.membershipAddress = value;
        }
    }

    @Value
    public static class MembershipIsValid {

        boolean membershipIsValid;

        public MembershipIsValid(boolean value) {
            this.membershipIsValid = value;
        }
    }

    @Value
    public static class MembershipIsCorp {

        boolean membershipIsCorp;

        public MembershipIsCorp(boolean value) {
            this.membershipIsCorp = value;
        }
    }
}
