package Yntaciq.ui;

import javax.swing.JFrame;

public class OvalFrame extends JFrame
{
    public OvalFrame() {
        // Создаем объект типа OvalComponent
        OvalComponent oc = new OvalComponent();
        // Испольщзуем метод класса JFrame для добавления
        // компонента на главную панель.
        add(oc);
        
        // Устанавливаем координаты и размеры окна
        setBounds(100, 100, 500, 300);
    }
    
}
