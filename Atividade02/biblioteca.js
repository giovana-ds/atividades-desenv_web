function trim(_str) {
    while (_str.charAt(_str.length - 1) == " ")
        _str = _str.substring(0, _str.length - 1);
    while (_str.charAt(0) == " ")
        _str = _str.substring(1, _str.length);
    return _str;
}
function eInteiroPositivo(_str) {
    var padrao = "0123456789"
    var i = 0;
    do {
        var pos = 0;
        for (var j = 0; j < padrao.length; j++)
            if (_str.charAt(i) == padrao.charAt(j)) {
                pos = 1;
                break;
            }
        i++;
    } while (pos == 1 && i < _str.length)
    if (pos == 0)
        return false;
    return true;
}
function validarForm(_oForm) {
    if (trim(_oForm.txtNome.value) == '') {
        alert('Por favor entre um valor na caixa "Nome"');
        oForm.txtNome.focus();
        return false;
    }
    if (trim(_oForm.txtIdade.value) == '') {
        alert('Por favor entre um valor na caixa "Idade"');
        _oForm.txtIdade.focus();
        return false;
    }
    if (!eInteiroPositivo(trim(_oForm.txtIdade.value))) {
        alert('Por favor entre somente numero positivo na caixa "Idade"');
        oForm.txtIdade.focus();
        return false;
    }
    return true;
}
