### Friday X-unit
import TestUnit as teste
from models.Tipo_Atividade import TipoAtividade
from models.Atividade import Atividade
from models.CupomDeDesconto import CupomDeDesconto
#from models.Data import Data
#from models.Evento import Evento
#from models.Inscricao import Inscricao
#from models.Instituicao import Instituicao


def main():
	
	"""
	atividade = Atividade("atividade1","fhehfh",100.00,"abc")
	print(teste.testFloat(100.1,atividade.getPreco()))
	print(atividade.toCSVString())
	
	a2 = Atividade.parseFromString(atividade.toCSVString())
	print(a2.getNome())
	"""
	
	cupom = CupomDeDesconto(
	
	
	
main()

"""
from bottle import *

bottle.debug(True)

@get('/')
def index():
    response.content_type = 'text/plain; charset=utf-8'
    ret =  'Hello world, I\'m %s!\n\n' % os.getpid()
    ret += 'Request vars:\n'
    for k, v in request.environ.iteritems():
        if 'bottle.' in k:
            continue
        ret += '%s=%s\n' % (k, v)

    ret += '\n'
    ret += 'Environment vars:\n'

    for k, v in env.iteritems():
        if 'bottle.' in k:
            continue
        ret += '%s=%s\n' % (k, v)

    return ret

run(host='localhost', port=8080)

"""