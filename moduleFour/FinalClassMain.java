package com.basics.tripillarAssignmentTwo.moduleFour;

final class SecuritySystem {
        void showStatus() {
            System.out.println("Security is active. This class cannot be extended.");
        }
    }

    public class FinalClassMain {
        public static void main(String[] args) {
            SecuritySystem ss = new SecuritySystem();
            ss.showStatus();
        }
    }

