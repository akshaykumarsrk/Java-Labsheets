
// 12. Inner class in Library
class Library {
    class Member {
        String name;
        int id;

        Member(String name, int id) {
            this.name = name;
            this.id = id;
        }

        void display() {
            System.out.println("Member Name: " + name + ", ID: " + id);
        }
    }

    public static void main(String[] args) {
        Library lib = new Library();
        Library.Member mem = lib.new Member("John", 101);
        mem.display();
    }
}
