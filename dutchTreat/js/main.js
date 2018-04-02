    (function() {
        'use strict';

        var priceForm = document.getElementById('price');
        var numForm = document.getElementById('num');
        var btn = document.getElementById('btn');
        var result = document.getElementById('result');

        priceForm.addEventListener('click', function() {
            this.select();
        });
        numForm.addEventListener('click', function() {
            this.select();
        });

        btn.addEventListener('click', function() {
            var price = priceForm.value;
            var num = numForm.value;
            var x1, x2, y1, y2;
            var unit = 100;

            if (price.match(/^[1-9][0-9]*$/) && num.match(/^[1-9][0-9]*$/)) {
                // ok
                // result.innerHTML = 'OK!';
                if (price % num === 0) {
                    result.innerHTML = '��l ' + (price / num) + ' �~���傤�ǂł��I';
                } else {
                    // result.innerHTML = 'something';
                    x1 = Math.floor(price / num / unit) * unit;
                    y1 = price - (x1 * num);
                    x2 = Math.ceil(price / num / unit) * unit;
                    y2 = Math.abs(price - (x2 * num));
                    result.innerHTML =
                    '��l ' + x1 + ' �~���� ' + y1 + ' �~����܂���B<br>' +
                    '��l ' + x2 + ' �~���� ' + y2 + ' �~�]��܂��B';
                }
            } else {
                // error
                result.innerHTML = '���͂��ꂽ�l�Ɍ�肪����܂��B';
            }
        });
    })();
