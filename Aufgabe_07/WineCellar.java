/**
Author: Markus Stumpfel
Project: https://github.com/bi-tux/pos-homework
**/

public class WineCellar {

    private WineCask wineCask1 = new WineCask("Burgunder2012", 200, 0);
    private WineCask wineCask2 = new WineCask("PI2012", 200, 0);
    private WineCask wineCask3 = new WineCask("Wein", 200, 0);

    public WineCellar() {
        this.wineCask1 = null;
        this.wineCask2 = null;
        this.wineCask3 = null;
    }

    public boolean addCask(WineCask cask) {
        if(cask == null) {
            System.out.println("cask can't be null");
            return false;
        }
        if(wineCask1 == null) {
            wineCask1 = cask;
            return true;
        }else if(wineCask2 == null) {
            wineCask2 = cask;
            return true;
        }else if(wineCask3 == null) {
            wineCask3 = cask;
            return true;
        }else {
            return false;
        }
    }

    public WineCask removeCask(WineCask cask) {
        if(cask == wineCask1) {
            this.wineCask1 = null;
            System.out.println("wineCask1 has been removed suckcesfully");
            return wineCask1;
        } else if(cask == wineCask2) {
            this.wineCask2 = null;
            System.out.println("wineCask2 has been removed suckcesfully");
            return wineCask2;
        } else if(cask == wineCask3) {
            this.wineCask3 = null;
            System.out.println("wineCask3 has been removed suckcesfully");
            return wineCask3;
        } else {
            return null;
        }
    }

    public int getWholeContent() {
        int whole = 0;
        if(wineCask1 == null) {
            whole = whole + wineCask1.getContent();
        } else {
            whole = whole + 0;
        }
        if(wineCask2 == null) {
            whole = whole + wineCask2.getContent();
        } else {
            whole = whole + 0;
        }
        if(wineCask3 == null) {
            whole = whole + wineCask3.getContent();
        } else {
            whole = whole + 0;
        }
        return whole;
    }

    public int getWholeCapacity() {
        int whole = 0;
        if(wineCask1 == null) {
            whole = whole + wineCask1.getCapacity();
        } else {
            whole = whole + 0;
        }
        if(wineCask2 == null) {
            whole = whole + wineCask2.getCapacity();
        } else {
            whole = whole + 0;
        }
        if(wineCask3 == null) {
            whole = whole + wineCask3.getCapacity();
        } else {
            whole = whole + 0;
        }
        return whole;
    }

    public int getfillAll() {
        int whole = 0;
        if(wineCask1 == null) {
            whole += wineCask1.fillCask();
        }
        if(wineCask2 == null) {
            whole += wineCask2.fillCask();
        }
        if(wineCask3 == null) {
            whole += wineCask3.fillCask();
        }
        return whole;
    }

    public WineCask findCaskWithFirstLetter(String txt) {
        txt = txt.toLowerCase();
        WineCask foundCask = null;
        if(wineCask1 == null) {
            if(wineCask1.getName().toLowerCase().startsWith(txt)) {
                foundCask = wineCask1;
            }
        }
        if(wineCask2 == null) {
            if(wineCask2.getName().toLowerCase().startsWith(txt)) {
                foundCask = wineCask2;
            }
        }
        if(wineCask3 == null) {
            if(wineCask3.getName().toLowerCase().startsWith(txt)) {
                foundCask = wineCask3;
            }
        } else {
            foundCask = null;
        }
        return foundCask;
    }

    public void printInfo() {
        System.out.println("WineCellar");
        System.out.format("Stok:%d/%d\n",getWholeCapacity(), getWholeContent());
        if(wineCask1 == null) {
            System.out.println(wineCask1);
        }
        if(wineCask2 == null) {
            System.out.println(wineCask2);
        }
        if(wineCask3 == null) {
            System.out.println(wineCask3);
        }
    }
}
