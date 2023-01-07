package c.inner;

public class AnonymousSample {
    public static void main(String[] args){

    }
    public void setButtonListener(){
        MagicButton button = new MagicButton();
        MagicButtonListener listener = new MagicButtonListener();
        button.setListener(listener);
        button.onClickProcess();
    }

    class MagicButtonListener implements MagicButton.EventListener{
        @Override
        public void onClick() {
            System.out.println("Magic Button Clicked!");
        }
    }
}
