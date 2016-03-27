private void a(final int n){
    if (n == this.a.length) {
        System.out.println("Here is a solution:\n");
        for (int i = 0; i < this.a.length; ++i) {
            for (int j = 0; j < this.a.length; ++j) {
                if (this.a[j] == i) {
                    System.out.print("Q ");
                } else {
                    System.out.print("_ ");
                }
            }
            System.out.println("\n");
        }
        ++this.c;
    }
    Label_0219: for (int k = 0; k < this.a.length; ++k) {
        if (!this.b[k]) {
            final int n2 = k;
            int l = 0;
            while (true) {
                while (l < n) {
                    if (Math.abs(n - l) == Math.abs(this.a[l] - n2)) {
                        final boolean b = true;
                        if (!b) {
                            this.a[n] = k;
                            this.b[k] = true;
                            this.a(n + 1);
                            this.b[k] = false;
                        }
                        continue Label_0219;
                    } else {
                        ++l;
                    }
                }
                final boolean b = false;
                continue;
            }
        }
    }
}